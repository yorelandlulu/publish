/**
 * Program  : OperaterServiceImpl.java
 * Author   : songkun
 * Create   : 2014年4月24日 下午11:37:01
 *
 */

package com.kun.flow.service.impl;

import com.kun.flow.data.OperaterBindRoleMapper;
import com.kun.flow.data.OperaterMapper;
import com.kun.flow.exception.ServiceException;
import com.kun.flow.model.Operater;
import com.kun.flow.model.OperaterExample;
import com.kun.flow.service.IOperaterService;
import com.kun.flow.util.MD5Util;

/**
 * 操作员业务处理实现类
 * 
 * @author songkun
 * @version 1.0.0
 * @2014年4月24日 下午11:37:01
 */
public class OperaterServiceImpl extends AbstractServiceImpl<Operater> implements IOperaterService {

	private OperaterBindRoleMapper operaterBindRoleMapper;

	private OperaterMapper operaterMapper;

    public OperaterMapper getOperaterMapper() {
        return operaterMapper;
    }

    public void setOperaterMapper(OperaterMapper operaterMapper) {
        this.operaterMapper = operaterMapper;
    }

    public OperaterBindRoleMapper getOperaterBindRoleMapper() {
		return operaterBindRoleMapper;
	}

	public void setOperaterBindRoleMapper(OperaterBindRoleMapper operaterBindRoleMapper) {
		this.operaterBindRoleMapper = operaterBindRoleMapper;
	}

	@Override
	public Operater validate(Operater operater) throws ServiceException {
		try {
			Operater temp = new Operater();
            if(operater.getType()!=null&&operater.getType()==0){
                temp.setName(operater.getName());
                temp = (Operater) findOneByExample(temp);
                if (temp == null || !temp.getPassword().equals(MD5Util.getMD5String(operater.getPassword())))
                    return null;
                else if(temp.getType()!=null&&temp.getType()==2)
                    return null;
                else return temp;
            }
            else{
                temp.setName(operater.getName());
                temp.setType(operater.getType());
                temp.setStatus(new Long(1));
                temp = (Operater) findOneByExample(temp);
                if (temp == null || !temp.getPassword().equals(MD5Util.getMD5String(operater.getPassword())))
                    return null;
                return temp;
            }
		} catch (ServiceException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean isExist(Operater operater) throws ServiceException {
		try {
            OperaterExample example = new OperaterExample();
            OperaterExample.Criteria c = example.createCriteria();
            c.andNameEqualTo(operater.getName());
            example.or(c);
			return !((OperaterMapper)getMapper()).selectByExample(example).isEmpty();
		} catch (Exception e) {
            throw new ServiceException(e);
        }
	}

	@Override
	public void delete(Operater operater) throws ServiceException {
		try {
			// 级联删除.这种方式有点别扭，不如hibernate来得美观。没有找到仅仅通过配置xml来达到级联删除的方式
			// 别扭，只是从代码美化、简化角度来说。级联删除的效果是实现了，因为，service方法处于一个事务中
			this.getOperaterBindRoleMapper().deleteByOperater(operater.getId());
			super.delete(operater);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
}

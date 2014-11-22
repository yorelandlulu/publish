var url;
var firstLevelCategory;
var editor = CKEDITOR.replace("TextArea1");
function checkAdmin(){
    $.ajax({
        url:'operater/getMyInfo.do',
        dataType : 'json',
        type : 'POST',
        success: function (d) {
            listnewsbycid(1);
            listsummary();
        }
    });
}
function listsummary(){
    $.ajax({
        url:'news/getsummary.do',
        dataType : 'json',
        type : 'GET',
        success: function (d) {
            $("#fragment-2 ul").empty();
            $("#fragment-2 ul").append("<li style='text-align: left; background-color: #967a64; color: white;'>投稿用户名<span style='margin-left:200px;color:white;'>投稿篇数</span><span style='margin-left:200px;color:white;'>部门</span></li>");
            for(var i in d){
                $("#fragment-2 ul").append("<li style='padding-bottom: 18px'><a href='javascript:viewsummarybyuser("+d[i].userid+")'>"+d[i].username+"</a><span style='float: left; margin-left: -200px;'>"+d[i].count+"</span><span style='float: left; margin-left: 20px;'>"+d[i].depart+"</span></li>");
            }
        }
    });
}
function listnewsbycid(pageno){
    $.ajax({
        url:'news/listbycategory.do',
        dataType : 'json',
        data : {categoryid: 0, page: pageno, rows: 10},
        type : 'POST',
        success: function (data){
            $("#fragment-1 ul").empty();
	    $("#fragment-1 ul").append("<li style='text-align: left; background-color: #967a64; color: white;'>标题<span style='margin-left:400px;color:white;'>编辑人</span><span style='margin-left:80px;color:white;'>状态</span></li>");
            for(var i in data.rows){
                $("#fragment-1 ul").append("<li><a href='#'>"+data.rows[i].title.replace("<br/>","")+"</a><span style='float: left; margin-left: -50px;'>"+data.rows[i].editname+"</span><span>"+data.rows[i].statusdis+"<a href='javascript:gotoview("+data.rows[i].id+")' class='edit'>查 看</a><a href='javascript:gotoedit("+data.rows[i].id+")' class='edit'>编 辑</a></span></li>");
            }
            $("#fragment-1 .pages span").empty();
			if(pageno>1)
				$(".btn_prev").attr("href","javascript:listnewsbycid("+(pageno-1)+")");
			if(pageno<(data.total/10-1))
				$(".btn_next").attr("href","javascript:listnewsbycid("+(pageno+1)+")");
            for(var i=0; i <data.total/10; i++ ){
                if(i==pageno-1){
                    $("#fragment-1 .pages span").append("<a class='on' href=javascript:listnewsbycid("+(i+1)+")>"+(i+1)+"</a>");
                }
                else{
                    $("#fragment-1 .pages span").append("<a href=javascript:listnewsbycid("+(i+1)+")>"+(i+1)+"</a>");
                }
            }
        }
    });
}

function newUser(){
    url = 'add.do';
    $.ajax({
        url:'newscategory/listRoot.do',
        dataType : 'json',
        type : 'POST',
        success: function (data){
            var jqData = data.rows;
            $('#cc1').combobox( 'loadData' , jqData);
			
        }
    });
}
function load2by1(cid1){
    $.ajax({
        url:'newscategory/listByPid.do',
        dataType : 'json',
        data : {pid :cid1 },
        type : 'POST',
        success: function (data){
            var jqData = data.rows;
            $('#cc2').combobox('loadData' , jqData);
        }
    });
}
function resetform(){
    $("#fm input, #fm textarea").val("");
    CKEDITOR.instances.TextArea1.setData('');
}

function validatecategory(){
    if($("input[name='categoryid3']").val()!=null&&$("input[name='categoryid3']").val()!=""){
        $("input[name='categoryid']").val($("input[name='categoryid3']").val());
    }
    else if($("input[name='categoryid']").val()==null||$("input[name='categoryid']").val()==""){
        $("input[name='categoryid']").val($("input[name='categoryid1']").val());
    }
}

function save(){

    $('#fm').form('submit',{
        url: 'news/add.do',
        onSubmit: function(){
            return $(this).form('validate');
        },
        success: function(result){
            var result = eval('('+result+')');
            if (!result.success){
                $.messager.show({
                    title: 'Error',
                    msg: result.message
                });
            }
            else{
                alert("添加成功！");
                resetform();
            }
        }
    });
}

function gotoview(id){
    window.open ('viewArticlePop.html?newsid='+id,'newwindow','height=700,width=900,top=0,left=0,toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no, status=no');
}
function gotoedit(id){
	window.open ('edit_back.html?editnewsid='+id,'newwindow','height=700,width=900,top=0,left=0,toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no, status=no');
}
function logout(){
        $.ajax({
            url:'login/logout.do',
            type : 'get',
            success: function (data){
                window.location.href = "login.html";
            }
        });
}

function popupresetpass(){
    window.open ('passwordedit.html','newwindow','height=300,width=700,top=0,left=0,toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no, status=no');
}


/**
 * Created by lenovo on 2014/11/23.
 */
var editnewsid = request.QueryString('userdetailid');

window.onload = function()
{
    loadUserDetailData(1, editnewsid);
    CKEDITOR.replace("content");
};

function loadUserDetailData(pageno, userid){
    $.ajax({
        url:'news/listbycategory.do',
        dataType : 'json',
        data : {operaterid: userid, page: pageno, rows: 10},
        type : 'POST',
        success: function (data){
            $("#fragment-1 ul").empty();
            $("#fragment-1 ul").append("<li style='text-align: left; background-color: #967a64; color: white;'>标题<span style='margin-left:400px;color:white;'>编辑人</span><span style='margin-left:180px;color:white;'>状态</span></li>");
            for(var i in data.rows){
                $("#fragment-1 ul").append("<li><a href='#'>"+data.rows[i].title.replace("<br/>","")+"</a><span style='float: left; margin-left: -50px;'>"+data.rows[i].editname+"</span><span>"+data.rows[i].statusdis+"</span></li>");
            }
            $("#fragment-1 .pages span").empty();
            if(pageno>1)
                $(".btn_prev").attr("href","javascript:loadUserDetailData("+(pageno-1)+")");
            if(pageno<(data.total/10-1))
                $(".btn_next").attr("href","javascript:loadUserDetailData("+(pageno+1)+")");
            for(var i=0; i <data.total/10; i++ ){
                if(i==pageno-1){
                    $("#fragment-1 .pages span").append("<a class='on' href=javascript:loadUserDetailData("+(i+1)+")>"+(i+1)+"</a>");
                }
                else{
                    $("#fragment-1 .pages span").append("<a href=javascript:loadUserDetailData("+(i+1)+")>"+(i+1)+"</a>");
                }
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
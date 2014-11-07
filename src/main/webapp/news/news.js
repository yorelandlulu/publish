var url;
var editor = CKEDITOR.replace("TextArea1");
function checkAdmin(){
    $.ajax({
        url:'operater/getMyInfo.do',
        dataType : 'json',
        type : 'POST',
        success: function (d) {
            listnewsbycid(d.id, 1);
        }
    });
}

function listnewsbycid(cid, pageno){
    $.ajax({
        url:'news/listbycategory.do',
        dataType : 'json',
        data : {id: cid, page: pageno, rows: 10},
        type : 'POST',
        success: function (data){
            $("#fragment-1 ul").empty();
            for(var i in data.rows){
                $("#fragment-1 ul").append("<li><a href='#'>"+data.rows[i].title.replace("<br/>","")+"</a><span>"+data.rows[i].posttime+"<a href='javascript:gotoview("+data.rows[i].id+")' class='edit'>查 看</a><a href='javascript:gotoedit("+data.rows[i].id+")' class='edit'>编 辑</a></span></li>");
            }
            $("#fragment-1 .pages span").empty();
			if(pageno>1)
				$(".btn_prev").attr("href","javascript:listnewsbycid("+cid+",'"+text+"',"+(pageno-1)+")");
			if(pageno<(data.total/10-1))
				$(".btn_next").attr("href","javascript:listnewsbycid("+cid+",'"+text+"',"+(pageno+1)+")");
            for(var i=0; i <data.total/10; i++ ){
                if(i==pageno-1){
                    $("#fragment-1 .pages span").append("<a class='on' href=javascript:listnewsbycid("+cid+",'"+text+"',"+(i+1)+")>"+(i+1)+"</a>");
                }
                else{
                    $("#fragment-1 .pages span").append("<a href=javascript:listnewsbycid("+cid+",'"+text+"',"+(i+1)+")>"+(i+1)+"</a>");
                }
            }
        }
    });
}
function resetform(){
    $("#title").val("");
    $("#subtitle").val("");
    $("textarea").val("");
    $(".datebox input").val("");
    CKEDITOR.instances.TextArea1.setData('');
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
	window.open ('edit.html?editnewsid='+id,'newwindow','height=700,width=900,top=0,left=0,toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no, status=no');
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


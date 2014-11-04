/**
 * Created by Administrator on 2014/8/27.
 */
var request =
{
    QueryString : function(val)
    {
        var uri = window.location.search;
        var re = new RegExp("" +val+ "=([^&?]*)", "ig");
        return ((uri.match(re))?(uri.match(re)[0].substr(val.length+1)):null);
    }
}


function toggleLeft(id){
    $("#container .center_contect .left_news .left_menu .center ul li ul li").addClass("hidden");
    $("#menuli"+id).children("ul").children("li").removeClass("hidden");
}
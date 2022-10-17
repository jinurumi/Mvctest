let frm = document.getElementById('loginForm');

btn = document.getElementById('loginBtn');
/*
btn.addEventListener('click', function (event) {
   let input = JSON.stringify({ name : frm.name.value, age: frm.age.value });
   click(input);
});
function click(json){
alert(json);
$.ajax({
  type: "POST",
  url: "http://localhost:8877/Login",
  data: {json},
  dataType: "json",
  success: function(response){
    console.log(response)
  },
  error: function(response){
    alert("error");
  }
});
}
*/
$(function() {
    $("#btn").on("click", function() {
        $.ajax("http://localhost:8877/Login")
        .done(function() {
            alert("요청 성공");
        })
        .fail(function() {
            alert("요청 실패");
        })
        .always(function() {
            alert("요청 완료");
        });
    });
});
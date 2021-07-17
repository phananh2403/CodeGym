function cong(){
    let num1 = parseInt(document.getElementById('nhap1').value);
    let num2 = parseInt(document.getElementById('nhap2').value);
    let result1 = num1 + num2;
    document.getElementById('result').innerHTML = "Result Division: " + result1;
}
function tru(){
    let num1 = parseInt(document.getElementById('nhap1').value);
    let num2 = parseInt(document.getElementById('nhap2').value);
    let result2 = num1 - num2;
    document.getElementById('result').innerHTML = "Result Division: " + result2;
}
function nhan(){
    let num1 = parseInt(document.getElementById('nhap1').value);
    let num2 = parseInt(document.getElementById('nhap2').value);
    let result3 = num1 * num2;
    document.getElementById('result').innerHTML = "Result Division: " + result3;
}
function chia(){
    let num1 = parseInt(document.getElementById('nhap1').value);
    let num2 = parseInt(document.getElementById('nhap2').value);
    let result4 = num1 / num2;
    document.getElementById('result').innerHTML = "Result Division: " + result4;
}
//BTVN: thêm các hàm mở rộng như căn bậc 2,căn bậc 3,sin - cos - tan - contan,giai thừa,.....
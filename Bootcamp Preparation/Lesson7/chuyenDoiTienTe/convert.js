
function doi(){
    let number = document.getElementById('number').value; //gán giá trị của number trong convert.js = 1 giá trị được nhập vào ô Amount(có id là number) từ file moneyConvert.html
    let result = number/24000; //gán giá trị result = number/24000
    console.log(result); //in ra màn hình giá trị result
    document.getElementById('result').innerHTML = "Result :" + result + " USD"; //sử dụng innerHTML để in ra màn mình kết quả chuyển đổi tại ô Result ( có id là result) từ file moneyConvert.html
    // innerHTML dùng để in ra màn hình html
    
}

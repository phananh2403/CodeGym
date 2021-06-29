function myColor(){
    var red = document.getElementById('red').value;
    var green = document.getElementById('green').value;
    var blue = document.getElementById('blue').value;

    document.getElementById('box').style.backgroundColor = "rgb(" + red + "," + green + "," + blue + ")";
    document.getElementById('red').innerHTML = red;
    document.getElementById('green').innerHTML = green;
    document.getElementById('blue').innerHTML = blue;
}
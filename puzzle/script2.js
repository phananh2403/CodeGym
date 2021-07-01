var images = [
    "monkey_part1x1.jpg",
	
	"panda_swap_part1x1.jpg"
	
];
var images2 = [
    "monkey_part2x1.jpg",
	
	"panda_swap_part2x1.jpg"
];
var images3 = [
    "monkey_part3x1.jpg",
	
	"panda_swap_part3x1.jpg"
];
var images4 = [
    "monkey_part4x1.jpg",
	
	"panda_swap_part4x1.jpg"
];
var images5 = [
    "monkey_part5x1.jpg",
	
	"panda_swap_part5x1.jpg"
];
//Các mảng chứa các phần tử là ảnh theo từng phần
var num = 0;
var num2 = 0;
var num3 = 0;
var num4 = 0;
var num5 = 0;
//Picture 1
function next(){
    var pic1 = document.getElementById('pic1');
    num++;
    if(num >= images.length){
        num = 0;
    }
    pic1.src = images[num];
}
function prev(){
    var pic1 = document.getElementById('pic1')
    num--;
    if(num < 0){
        num = images.length-1;
    }
    pic1.src = images[num];
}
//Picture 2
function next2(){
    var pic2 = document.getElementById('pic2');
    num2++;
    if(num2 >= images2.length){
        num2 = 0;
    }
    pic2.src = images2[num2];
}
function prev2(){
    var pic2 = document.getElementById('pic2')
    num2--;
    if(num2 < 0){
        num2 = images2.length-1;
    }
    pic2.src = images2[num2];
}
//Picture 3
function next3(){
    var pic3 = document.getElementById('pic3');
    num3++;
    if(num3 >= images3.length){
        num3 = 0;
    }
    pic3.src = images3[num3];
}
function prev3(){
    var pic3 = document.getElementById('pic3')
    num3--;
    if(num3 < 0){
        num3 = images3.length-1;
    }
    pic3.src = images3[num3];
}
//Picture 4
function next4(){
    var pic4 = document.getElementById('pic4');
    num4++;
    if(num4 >= images4.length){
        num4 = 0;
    }
    pic4.src = images4[num4];
}
function prev4(){
    var pic4 = document.getElementById('pic4')
    num4--;
    if(num4 < 0){
        num4 = images4.length-1;
    }
    pic4.src = images4[num4];
}
//Picture 5
function next5(){
    var pic5 = document.getElementById('pic5');
    num5++;
    if(num5 >= images5.length){
        num5 = 0;
    }
    pic5.src = images5[num5];
}
function prev5(){
    var pic5 = document.getElementById('pic5')
    num5--;
    if(num5 < 0){
        num5 = images5.length-1;
    }
    pic5.src = images5[num5];
}
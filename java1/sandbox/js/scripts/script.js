var a = 20;
var b = 30;
var result = a + b;
var c = (a > b) ? alert("True") : document.write("Okay, a is less than b. ");
if ( a < b ) {
    var result = a + b;
    document.write("<br>");
    document.write("The result of a + b is ", result);
} else {
    document.write("a is less than b, invalid data.");
}
document.write("<br>");
document.write("<br>");
document.write("<br>");
for (var i=1; i<=5; i++)
{
    for (var j=1; j<=i; j++)
    document.write(" *")
    document.write("<br>");
}
document.write("<h2>HELLO WORLD</h2>");
var dog = "pekingese";


switch (dog) {
    case "pekingese":
        document.write("I miss CHooea");
        break;
        
    case "poodle":
        document.write("I miss Lauren");
        break;

    default:
        alert("Sorry, that dog isn't available.")
}

var count = 0;
while (count < 5) 
{
    document.write("<br /> *");
    count++;
}

function callArea(w, h) {
    var area = w * h;
    document.write("<br />"+area);
}

callArea(5, 3);
document.write("<br />");

function calc() {
    var w = document.getElementById("width").value;
    var h = document.getElementById("height").value;

    var area = w * h;
    document.getElementById("answer").value = area;
}

var value = Math.floor(Math.random() *6) + 1;
document.write(value + "<br />"); 

function draw(x,y)
{
    var canvas = document.getElementById('canvas');
    var ctx = canvas.getContext('2d');
        ctx.save();
        ctx.clearRect(0,0,250,200);
        ctx.fillStyle = "rgba (0,200,0,1)";
        ctx.fillRect (x, 20, 50, 50);
        ctx.restore();
        x += 5;
        var loopTimer = setTimeout('draw('+x+','+y+')'m200);
}

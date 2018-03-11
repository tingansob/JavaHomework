const upperName = (name) => name.toUpperCase();

function sayHello() {
    alert("Hello World")
}

var linebreak = "<br />";
//sayHello();
document.write(linebreak);
var myVar = "Global"; // declare global variable
document.write(myVar);

function checkscope() {
    var myVar="Local"; // declare local variable
    document.write(myVar);
    document.write(linebreak);
}
checkscope();
document.write(linebreak);

const log = (...args) => {
    console.log(...args);
};

log('hello', ' Kevin George Rusty.', 'How are you today?');

const head = ([x]) => x;
console.log(head([1, 2, 3]));

document.getElementById("rusty").innerHTML = "Kevin, thre learning JavaScript.";



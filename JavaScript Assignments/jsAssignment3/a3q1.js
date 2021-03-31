class rectangle{
      constructor(width, height){
          this.width=width;
          this.height=height;
      }

}

let obj1= new rectangle(5,6);
console.log(obj1.height);
console.log(obj1.width);
obj1.width=10;
console.log(obj1.width);
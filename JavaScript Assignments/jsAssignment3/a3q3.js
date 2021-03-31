class rectangle{
    constructor(width, height){
        this.width=width;
        this.height=height;
    }

 getArea(){
        return (this.width*this.height);
    }

}

let obj1= new rectangle(4,5);
obj1.hieght=50;
 console.log(obj1.getArea());
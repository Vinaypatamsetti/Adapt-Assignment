function getNextArmstrong(n:any) {
    n = parseInt(n);
    if (n > 1000) {
        n = 0;
    }
    while (n < 1000) {
        let digits = n.toString().length;
        let x = n;
        let num = 0;
        while (x > 0) {
            let r = x % 10;
            num = num + r ** digits;
            x = (x / 10);
        }
        if (num === n)
            return n;
        n++;
    }
    return;
    
}
console.log(getNextArmstrong(153));
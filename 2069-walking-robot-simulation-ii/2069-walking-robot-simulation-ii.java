class Robot {
    int grid[][];
    char dir[]={'E','N','W','S'};
    int x=0;
    int y=0;
    int xs;
    int ys;
    int d=0;
    public Robot(int width, int height) {
        grid=new int [height][width];
        xs=width;
        ys=height;
    }
    
    public void step(int num) {
        int perimeter = 2 * (xs + ys) - 4;
        num = num % perimeter;

        if (num == 0) {
            if (x == 0 && y == 0) {
                d = 3; 
            }
            return;
        }

        int steps=0;
        if(dir[d]=='E'){
            if((x+num)>=xs){
                steps=num-(xs-1-x);
                x=x+(xs-1-x);
                d=(d+1)%4;
                if(steps!=0){
                    step(steps);
                }
            }
            else{
                x+=num;
            }
        }
        else if(dir[d]=='N'){
            if((y+num)>=ys){
                steps=num-(ys-1-y);
                y=y+(ys-1-y);
                d=(d+1)%4;
                if(steps!=0){
                    step(steps);
                }
            }
            else{
                y+=num;
            }
        }
        else if(dir[d]=='W'){
            if((x-num)<0){
                steps=num-x;
                x=0;
                d=(d+1)%4;
                if(steps!=0){
                    step(steps);
                }
            }
            else{
                x-=num;
            }
        }
        else{
            if((y-num)<0){
                steps=num-y;
                y=0;
                d=(d+1)%4;
                if(steps!=0){
                    step(steps);
                }
            }
            else{
                y-=num;
            }
        }
    }
    
    public int[] getPos() {
        return new int[]{x,y};
    }
    
    public String getDir() {
        if(d==0){
            return "East";
        }
        else if(d==1){
            return "North";
        }
        else if(d==2){
            return "West";
        }
        return "South";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
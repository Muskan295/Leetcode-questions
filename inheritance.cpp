#include<iostream>
using namespace std;
class Cuboid {
public:
   int length;
   int width;
   int height;
   void display(){
        cout<< length<<" "<<width<<" "<<height<<endl;
   }
    
};

class CuboidVol : public Cuboid {
    public:
    void read_input(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
    void display(){
    int volume=length*width*height;
    cout<<volume<<endl;
}

};
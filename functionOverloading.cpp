#include <iostream>
using namespace std;
void volume(int s) {
    int cube=s*s*s;
    cout<<cube<<endl;
}

void volume(int r, int h) {
    float pie= 3.14159 ;
    float cylinder= pie * r*r*h;
    cout<<cylinder<<endl;
}

void volume(int l, int b, int h) {
    int rectangle=l*b*h;
    cout<<rectangle<<endl;
}


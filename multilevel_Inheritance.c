// User function Template for C
struct student{
    int roll_number;
};
struct test{
    struct student s;
    float marks[5];
};
struct result{
    struct test t;
    int total_marks;
    int average_marks;
};

// Add set_marks() function for "test"
void set_marks(struct test* t, float temp[5]){
    for(int i=0;i<5;i++){
        t->marks[i]=temp[i];
    }
}

// Add display() function for "result"
void display(struct result* r){
    r->total_marks=0;
    for(int i=0;i<5;i++){
        r->total_marks+=r->t.marks[i];
    }
    r->average_marks=0;
    r->average_marks=r->total_marks/5;
    printf("%d " ,r->t.s.roll_number);
    printf("%d ",r->total_marks);
    printf("%d\n",r->average_marks);
}

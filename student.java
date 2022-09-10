public class student{
String name;
int rollno;
String branch;
double percentage;
String collegename;
student(){
	name = "success";
	percentage = 5.5 ;
	
	branch = "2ndsuccess";
	collegename = "bharath university";
	
	rollno = 8;
}

void setname(String ss){
name = ss;

}
String getname(){
return name;
}

void setrollno(int e){
	
	rollno = e;
}
int getrollno(){
	return rollno;
}

void setbranch(String f){
	branch = f;
}

String getbranch(){
	
	return branch;
	
}
void setpercentage(double f){
	percentage =f;
	
	
}
double getpercentage(){
		return percentage;
}

void setcollegename(String cn){
	collegename = cn;

}
String getcollegename(){
	
	return collegename;
}
}
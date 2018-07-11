
/*write data on file*/
FileOutputStream fout=new FileOutputStream("abc.txt");
String s="C is a programming language developed at AT & T’s Bell Laboratories of USA in 1972. It was designed and written by a man named Dennis Ritchie. In the late seventies C began to replace the more familiar languages of that time like PL/I, ALGOL, etc. No one pushed C. It wasn’t made the ‘official’ Bell Labs language. Thus, without any advertisement C’s reputation spread and its pool of users grew. Ritchie seems to have been rather surprised that so many programmers preferred C to older languages like FORTRAN or PL/I, or the newer ones like Pascal and APL. But, that's what happened. 
Possibly why C seems so popular is because it is reliable, simple and easy to use. Moreover, in an industry where newer languages, tools and technologies emerge and vanish day in and day out, a language that has survived for more than 3 decades has to be really good ;
byte b[]=s.getByts();
for (int i=0;i<b.length();i++)
{
  fout.write(b[i]);
   //write() method is overloded for byte[]
   fout.write(b);
   fout.close();
}   


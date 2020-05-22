package task1_project;

public class myfirstclass {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
	
		
	System.out.println("Git is Awesome");
	}

}


With the above to reflect, this is basically how I went about it:

$ cd
>> $cd /c // to direct me to my c drive
>>$ ls // to list and see if the empty folder i have created has been listed
>>$ cd git/ //which then directs me to my github
>> $ git config -- global user.name "Thatohatsi880" //which allows logging into your github
>> $ git config -- global email thatohatsitilodi@gmail.com // which then allows the logging in to my github using the email so to lead to my respository
>> $ git clone ("that to copy and paste the link in my my respository)// which then shows the complete connectivity between the two
>> $ ls // which then lists the new folder created under the C: drive which is trackfile
>> $ cd TrackFolders //to direct me back to the folder
>> ls // the lists the Readme.md file created under the Folder
>> //Then pasted the HelloWorld java file that I copied from Java which was viewed through noted pad
>> ls (Readme helloWorld.java) // showing both those files listed under TrackFolders folder
>> git add helloWorld // Which will add the java file into my git
> git add // which then tells status majorly bothe the two above being recently added
		>git commit -m "first commit" helloWorld // commits the file to github command
>> git push -u origin master // pushes the changes to the respository which then first asks for credentials before transferring the changes
		//which then appears on my github
// To change the file above you then open it and then go vback to the C: drive and then double click to open then change the text above from hello word to Git is awesome, then presss the up command till the git statucs.
		//what will be given will be a warning that the the status that a the status has been modified,>> Git push again and that will then be final


In terms of the branch its self these are the steps I committed below:
Change a directory($cd /c) //which leads me to the c drive
>> $git branch(issue-1) // which then creates the new branch
>>$ git checkout issue-1 // to check out of my newly created branch
>> $ f issue-1 // to add the helloWorld file into the branch issue-1
>> $ git add (to add hellowWorld after doing some of the changes on it)
>> $ git commit -m //commit some of the changes made to the file
>> $ git log -3 //to give me whats listed under
>> $ git checkout master // to switch from C: drive to master
>>$  git merge (issue-1) // to merge the two
>> $ git  log - graph // to view the changes in graph form, shows a complete staus of the above

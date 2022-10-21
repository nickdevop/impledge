package impledge;
// self made node class which we ar using in trie later on
public class Node {
Node Links[]=new Node[26];
boolean flag=false; 


boolean containsKey(char ch)  // boolean function to check its contains that charatcer or not 
{
	return (Links[ch-'a']!=null);
}
Node get (char ch)  // get the partricular charc so to get the prefix till now
{
	return Links[ch-'a'];
}
void put (char ch,Node node)  // put the character as a prfix
{
	Links[ch-'a']=node;
} 
void setEnd() //set the end 
{
	flag=true;
	}
boolean isEnd()  // check that if is it end  or not
{ 
	return flag;
}
}

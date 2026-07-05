  int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
  String Roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
  String  Result="";
  
  for(int i=0;i<values.length;i++)
  {
  while(nums>=values[i])
  {
     Result+=Roman[i];
	 nums-=values[i];
  }
  }
  return Result;
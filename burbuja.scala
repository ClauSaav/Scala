object metodoBurbuja {
  def main(args : Array[String])
  {
    var arreglo= new Array[Int](6);
   
    //Entrada de mis numeros
    println("Ingresa 5 números aleatorios : ");
    for(i <- 0 to 4)
    {
      arreglo(i)=scala.io.StdIn.readLine().toInt;
    }
    
    //Acomodando numeros
    for(i <- 0 to 4)
    {
      for(j <- 0 to 3)
      {
        if(arreglo(j)>arreglo(j+1))
        {
          var temp:Int =arreglo(j);
          arreglo(j)=arreglo(j+1);
          arreglo(j+1)=temp;
        }
      }
    }
    
    //Salida
    for(i <- 0 to 4)
    {
      print(arreglo(i)+"\t");
    }
  }
}

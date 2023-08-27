private double firstValue;
	private double secondValue;
	public void start (){
		
		String value ;
		Scanner entradaPorTeclado = new Scanner (System.in);
            //definimos la variable que se crea
            System.out.println("Bienvenido al proyeto calculadora sin interfaz gráfica en java");
            System.out.println("Type first number");
            value 			  = entradaPorTeclado.next();
            firstValue 		 = checkValidDouble(value);
            System.out.println("Type sencond number");
            value 			   = entradaPorTeclado.next();
        
		secondValue 	= checkValidDouble(value);
		double result = doTheCalc();
		value = Double.toString(result);
		 System.out.println("El reusltado  es "+value);

	}
	private double checkValidDouble (String stringToCheck){
		/*try {*/

            return Double.parseDouble(stringToCheck);
        /* } catch (NumberFormatException e) {
            		System.out.println("Type first number");
					Scanner entradaPorTeclado = new Scanner (System.in);
		return checkValidDouble(entradaPorTeclado.next());
        }*/
	}

	private double doTheCalc (){
		double result ;
		String value ;
		Scanner entradaPorTeclado 	= new Scanner (System.in);
		int tipeOfOperation = 1;
		try {
			System.out.println("Type 1: suma, 2: resta, 3:multiplica, 4:divide cualquier otra cosa suma");
			
			value 										= entradaPorTeclado.next();
			 tipeOfOperation 					= Integer.parseInt(value);
		} catch (NumberFormatException  e) {
			
		}


		switch (tipeOfOperation) {
            case 1:
			//suma
                result = firstValue + secondValue ;
                break;
            case 2:
			//resta
                result = firstValue - secondValue ;
                break;
            case 3:
			//multiplicación
                result = firstValue * secondValue ;
                break;
			case 4:
			//división
                result = firstValue / secondValue ;
                break;
            default:
			 result = firstValue + secondValue ;
                
        }
		return result;
	}
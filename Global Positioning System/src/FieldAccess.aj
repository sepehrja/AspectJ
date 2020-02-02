
public aspect FieldAccess {
   before() : get(* GPSCoordinate.*) {
      System.out.println(">Read access: " + thisJoinPoint);
   }
   before() : set(* GPSCoordinate.*) {
	   System.out.println(">Write access: " + thisJoinPoint);
   }
}


int arrayMaximalAdjacentDifference(int[] inputArray) {
    int maximaDiferencia = 0;
    int diferencia;

    for ( int i = 1; i < inputArray.length; i++ ){
        diferencia = Math.abs( inputArray[ i ] - inputArray[ i-1 ] );

        if ( diferencia > maximaDiferencia ){
            maximaDiferencia = diferencia;
        }
    }

    return maximaDiferencia;
}

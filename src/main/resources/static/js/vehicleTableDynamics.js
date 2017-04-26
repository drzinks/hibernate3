/**
 * Created by Michal on 2017-04-25.
 */

$(document).ready(function() {
    var table = $('#vehiclesTable').DataTable();
    var counter = 1;

    $('#addRow').on( 'click', function () {
        table.row.add( [
            counter +'.1',
            counter +'.2',
            counter +'.3',
            counter +'.4',
            counter +'.5'
        ] ).draw( false );

        counter++;
    } );

    // Automatically add a first row of data
    $('#addRow').click();
} );
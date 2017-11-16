$ (document).ready(main);

function main() {

    $('.btn-collapse').click(function(e){
        e.preventDefault();     /* This will prevent the regular button function, as jquery needs to take care of it */
        var $this = $(this); /* when we press the button it will show the text and if we press again it will disappear*/
        var $collapse =$this.closest('.collapse-group').find('.collapse');
        $collapse.collapse('toggle');
    });
}
$('#uploadForm').fileupload({
    dataType: 'json',
    autoUpload: false,
    sequentialUploads: false,
    progressall: function (e, data) {
        var progress = parseInt(data.loaded / data.total * 100, 10);
        $('#submit').text("submitting ... " + progress);
        $("#progressBar").progressbar({
            value: progress
        });
    },

    add: function (e, data) {
        data.context =
        $('#submit').click(function () {
            data.submit();
            $("#submit").off("click");
        });
    },

    done: function (e, data) {
        $('#submit').text("Done");
    }

});


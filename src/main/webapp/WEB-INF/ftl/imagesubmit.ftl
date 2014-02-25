<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>

<div id="progressContainer">
    <span class="progress-bar" style="width: 0%;" id="progress_bar"></span>
    <input type="text" id="progress_percent"/>
</div>

<form action="/index/submit" method="post" enctype="multipart/form-data" id="uploadForm1">
    <input name="imgFile" id="imgFile" type="file" />
    <input name="imgFile" id="imgFile2" type="file" />
    <input type="submit" value="submit" id="submit">
</form>

<script type="text/javascript" src="/resource/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/resource/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="/resource/js/jquery.iframe-transport.js"></script>
<script type="text/javascript" src="/resource/js/jquery.fileupload.js"></script>
<script type="text/javascript" src="/resource/js/script.js"></script>

<script>

    function getProgress() {
        var now = new Date();
        $.ajax({
            type: "post",
            dataType: "json",
            url: PATH + "/index/progress",
            data: now.getTime(),
            success: function(data) {
                $("#progress_percent").text(data.percent);
                $("#progress_bar").width(data.percent);
            },
            error: function(err) {
                $("#progress_percent").text("Error");
            }
        });
    }
    function fsubmit(){

    }
</script>

</body>
</html>
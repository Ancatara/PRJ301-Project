

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creator</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/reset.css">
    </head>
    <body>
        <div class="container">
            <!--begin of menu-->
            <jsp:include page="Header.jsp"/>
            <!--end of menu-->
            <!--begin of form-->
            <div class="creator-form">
                <div class="creator-form__container">
                    <form class="form-cre" action="creator" method="post">
                        <input name="title" type="text" class="content-title" style="font-size: 24px" placeholder="Title . . .">   <br>
                        <label for="exampleFormControlInput1" class="text">Link image</label>
                        <input name="image" type="text" class="form-control" id="" placeholder="Link image" style="padding: 5px;">
                        <label for="exampleFormControlInput1" class="text">DESCRIPTION</label><br>
                        <textarea name="description" id="content-form" cols="20" rows="3" placeholder="Type in here"></textarea>
                        <button  type="submit" class="btn-create" style="display: inline-block; align-content: center">Create</button>

                    </form>
                    <!--end of form-->
                </div>
                <style>
                    .text{
                        
                    color: transparent;
                    background-clip: text;
                    -webkit-background-clip: text;
                    background-image: linear-gradient( to right,  #1a2b5f,  #ffc87a);  
                   
                    }
                    .btn-create{
                        margin-left: 15px;
                        background-color: #ffc87a;
                        border: none;
                        border-radius: 5px;
                        padding: 15px;
                        color: #1a2b5f;
                        font-size: 20px;
                    }
                    
                </style>
            </div>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

    </body>
</html>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"></meta>
    <style>
        .apply {
            margin: 0 auto;
            padding: 0 30px;
        }
        .title {
            margin-top: 40px ;
            text-align: center;
            font-weight: bold;
        //字体需要和后台对应上
        font-family: SimSun;
            font-weight: bold;
            font-size: 20px;
            color: #333333;
            letter-spacing: 0;
        }
        .table {
            width: 100%;
            margin-top: 30px;
            font-family: SimSun;
            font-size: 14px;
            color: #111111;
            letter-spacing: 0.54px;
        }
        .label {
            background-color: #E6E6E6;
            width: 20%;
        }
        .normaltd {
            padding: 10px 0;
        }
        .maxtd {
            height: 250px;
        }
        .value {
            width: 30%;
            padding-left: 10px;
        }
    </style>
</head>

<body style="font-family: SimSun">
<div class="apply">
    <p class="title">申请单</p>
    <table border="1" cellspacing="0" class="table">
        <tr>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
        </tr>
        <tr>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
        </tr>
        <tr>
            <td class="label" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
        </tr>
        <tr>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">XXX</td>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
        </tr>
        <tr>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
            <td class="label normaltd" align="center">XXX</td>
            <td class="normaltd value">${XXX}</td>
        </tr>
        <tr >
            <td valign="middle" colspan="1" class="label maxtd" align="center">XXX</td>
            <td valign="middle" colspan="3" class="maxtd value">${XXX}</td>
        </tr>
        <tr>
            <td colspan="1" class="label normaltd" align="center">XXX</td>
            <td colspan="3" class="normaltd value">${XXX}</td>
        </tr>
        <tr>
            <td colspan="1" class="label normaltd" align="center">XXX</td>
            <td colspan="3" class="normaltd value">${XXX}</td>
        </tr>
        <tr>
            <td colspan="1" class="label normaltd" align="center">XXX</td>
            <td colspan="3" class="normaltd value">${XXX}</td>
        </tr>
    </table>
</div>
</body>
</html>
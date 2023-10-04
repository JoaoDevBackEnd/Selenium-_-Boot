Esse é um projeto amostra para os primeiros passos Utilizando o Selenium na versão 4.12
Ainda nesse repósitorio irei publicar a integração do Framework APACHE POI para realizar leitura de planilhas EXCEL, e ainda integrar HIBERNATE para raspagem de dados 


***ATENÇÃO Ao clonar o projeto exclua as linha:  

Thread.sleep(1000);
            WebElement datenascimento = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value = '';", datenascimento);
            datenascimento.sendKeys(c.get_nascimento());


No arquivo app.java da pasta SRC, essa linha está em desuso e o projeto não foi atualizado até o momento, além de excluir a função mensionada apague na Listaformulario.java   as ultimas atribuição da Array a respeito de "nascimento" que é a data de nascimento , e exclua o método construtor "String nascimento" de Cadastroformulario.java  

Nas próximas etapas com a integração com o ApachePOI essas linhas estarão corrigidas OBRIGADO ^^ 

<h1 style="color:#FF5733">Programación en Lua haciendo uso de operaciones de conjuntos</h1>

<h2>Para este programa utilice SublimeText 3 para poder trabajar el lenguaje de Lua para lo que se necesito realizar una investigación en la red
<br>Una vez conocida la sintaxis necesitada para realizar las operaciones para realizar la tarea, y de tanto buscar me di cuenta que lua cuenta	
<br>con menos funciones o por lo menos yo no las encontre para hacer recorridos de funciones basica que tiene C++ pero aqui se hace algo diferente
<br>entonces en si esto fue como el como buscar todo esto y aparte ver que cosas adicionales agregarles.</h2>
<br>
<p>Yo con el codigo corri todo el programa voy poniendo una funcion cada vez que termina otra</p>

<p> Source Code</>

```lua



# -180276-conjuntos.lua-*-
# -Manuel Alejandro Guerrero González-*-


--Aqui declaramos las variables que pueden tomar cualquier tipo
A={}
B={}
C={}

--Declaramos los valores de las variables donde las escanearemos con el io.read con el *n que seria un valor entero
for i=0,4 do
    print("Dame un numero del arreglo A")
    A[i]=io.read("*n")
end

for i=0,4 do
    print("Dame un numero del arreglo B")
    B[i]=io.read("*n")
end

io.read()
print("Arreglo A: ",A[0],A[1],A[2],A[3],A[4])
print("Arreglo B: ",B[0],B[1],B[2],B[3],B[4])
print("Arreglo C: ",C[0])

--Vamos a borrar un elemento del arreglo con un arreglo de for y un if para comprobar
var=0
print("¿Que numero del arreglo (A) quiere borrar?")
var=io.read("*n")
for i=0,4 do
    if var==A[i] then
        A[i]=nil
    end
end
print("¿Que numero del arreglo (B) quiere borrar?")
var=io.read("*n")
for i=0,4 do
    if B[i]==var then
        B[i]=nil
    end
end

io.read()

print("Arreglo A: ")
for i=0,4 do
    if A[i]~=nil then
        print(A[i]) 
    end
end
print("Arreglo B: ")
for i=0,4 do
    if B[i]~=nil then
        print(B[i]) 
    end
end

--Vamos a eliminar todos de uno 
--Aqui pusimos el valor del arreglo en nil que es como vacio
print("Vamos a elimiar todos los valores del arreglo A")
for i=0,4 do
    A[i]=nil
end
io.read()
print("Arreglo A: ")
for i=0,4 do
    print(A[i])
end

--Vamos a copiar del conjunto B al conjunto A
print("Vamos a copiar los elementos del arreglo B al A")
for i=0,4 do
    A[i]=B[i]
end
io.read()
print("Arreglo A: ")
for i=0,4 do
    if A[i]~=nil then
        print(A[i]) 
    end
end
print("Arreglo B: ")
for i=0,4 do
    if B[i]~=nil then
        print(B[i]) 
    end
end
io.read()

--Vamos a agregar un valor al conjunto B
print("Escribe un numero para agregar al conjunto B")
B[5]=io.read("*n")
io.read()
print("Arreglo B: ")
for i=0,5 do
    if B[i]~=nil then
        print(B[i]) 
    end
end

--Empezaremos con las operaciones de conjuntos
--Funcion de Union
--En esta funcion se juntaran los 2 conjuntos sin repetir valores
io.read()
valor=0
valor2=0
C={}
print("Ahora se hara la funcion de Union")
print("Arreglo A: ")
for i=0,10 do
    if A[i]~=nil then
        print(A[i]) 
        valor=valor+1
    end
end
print("Arreglo B: ")
for i=0,10 do
    if B[i]~=nil then
        print(B[i]) 
        valor2=valor2+1
    end
end

for i=0,valor do
    C[i]=A[i]
end

valor2=valor2+valor
for i=valor,valor2 do
    C[i]=B[i]
end

print("Arreglo C: ")
for i=0,valor2 do
    if C[i]~=nil then
        print(C[i]) 
    end
end

--Funcion de Interseccion 
--En esta funcion nos dira los numeros que estan entre los conjuntos A y B
io.read()
C={}
print("Ahora se hara la funcion de Interseccion")
con=0
for i=0,5 do
    for j=0,5 do
        if A[i]==B[j] then
            C[con]=A[i]
            con=con+1
        end
    end
end
print("Arreglo A: ")
for i=0,con do
    if A[i]~=nil then
        print(A[i]) 
    end
end
print("Arreglo B: ")
for i=0,con do
    if B[i]~=nil then
        print(B[i]) 
    end
end
print("Numeros de la Interseccion: ")
for i=0,con do
    if C[i]~=nil then
        print(C[i]) 
    end
end
io.read()
--Funcion de diferencia
--Esta funcion es para ver los numeros que estan en A pero no en B
print("Funcion de diferencia donde utilizaremos")
print("nuevos valores")
for i=0,4 do
    print("Dame un numero del arreglo A")
    A[i]=io.read("*n")
end

for i=0,4 do
    print("Dame un numero del arreglo B")
    B[i]=io.read("*n")
end

contador=-1
bandera=false
Z={}

for i=0,#A do
    contador=contador+1
    for j=0,#B do
        if A[i]==B[j] then
            bandera=true
        end
    end
    if bandera==true then
            Z[contador]=nil
            bandera=false
            contador=contador-1
    else if bandera==false then
            Z[contador]=A[i]
        end
    end
end

print("Arreglo C: ")
for i=0,#Z do
    if Z[i]~=nil then
        print(Z[i]) 
    end
end
io.read()

--Diferencia simetrica
--En la diferencia simetrica utilice la diferencia pero en este es lo que hay en cada uno pero que no este en los 2
print("Funcion de diferencia simetrica donde utilizaremos")
print("nuevos valores")
for i=0,4 do
    print("Dame un numero del arreglo A")
    A[i]=io.read("*n")
end

for i=0,4 do
    print("Dame un numero del arreglo B")
    B[i]=io.read("*n")
end
bandera=false
contador=-1
Z={}

for i=0,#A do
    contador=contador+1
    for j=0,#B do
        if A[i]==B[j] then
            bandera=true
        end
    end
    if bandera==true then
            Z[contador]=nil
            bandera=false
            contador=contador-1
    else if bandera==false then
            Z[contador]=A[i]
        end
    end
end

for i=0,#B do
    contador=contador+1
    for j=0,#A do
        if B[i]==A[j] then
            bandera=true
        end
    end
    if bandera==true then
            Z[contador]=nil
            bandera=false
            contador=contador-1
    else if bandera==false then
            Z[contador]=B[i]
        end
    end
end

print("Arreglo C: ")
for i=0,#Z do
    if Z[i]~=nil then
        print(Z[i]) 
    end
end
io.read()

--Subconjunto
--Se declara 2 arreglos nuevos para poder comparar los conjuntos para ver si B es subconjunto de A
a={}
b={}
contadorcito=0;
print("Ahora para los Subconjunto crearemos 2 nuevos")
print("Donde comprobaremos si B es subconjunto de A")

for i=0,4 do
    print("Dame un numero del arreglo A")
    a[i]=io.read("*n")
end

for i=0,2 do
    print("Dame un numero del arreglo B")
    b[i]=io.read("*n")
end

io.read()

for i=0,#a do
	for j=0,#b do
		if a[i]==b[j] then
			contadorcito=contadorcito+1
		end
	end
	if contadorcito==3 then
			print("El conjunto B es subconjunto de A")
			break
		end
end
if contadorcito<3 then
	print("B no es subconjunto de A")
end
io.read()

--Superconjunto
--Esto es exactamente lo mismo de los valores de B que tienen que estar en A
contadorcito=0;
print("Ahora veremos si A es Superconjunto de B")
io.read()

for i=0,#a do
	for j=0,#b do
		if a[i]==b[j] then
			contadorcito=contadorcito+1
		end
	end
	if contadorcito==3 then
			print("A es el Superconjunto de B")
			break
		end
end
if contadorcito<3 then
	print("A no es el Superconjunto de B")
end
io.read()
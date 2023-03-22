texto = input("Digite qualquer coisa: ")

texto_invertido = ''
for i in range(-1,-len(texto)-1, -1):
    texto_invertido += texto[i]

print(texto_invertido)
import json


def menor_valor(lista):
    menor = lista[0]['valor']
    for i in lista:
        if i['valor'] != 0 and i['valor'] < menor:
            menor = i['valor']
    return menor


def maior_valor(lista):
    maior = 0
    for i in lista:
        if i['valor'] > maior:
            maior = i['valor']
    return maior


def contar_dif_zero(lista):
    contagem = 0
    for numero in lista:
        if numero['valor'] != 0:
            contagem += 1
    return contagem


def calcular_media(lista):
    dias = contar_dif_zero(lista)
    total = 0
    for i in lista:
        total += i['valor']
    return total / dias


def dias_acima_media(lista):
    contagem = 0
    media = calcular_media(lista)
    for i in lista:
        if i['valor'] > media:
            contagem += 1
    return contagem


with open('dados.json') as f:
    faturamento = json.load(f)

menor_vlr = menor_valor(faturamento)
print(f"O menor valor de faturamento em um dia do mês foi R${menor_vlr}")

# poderia usar a função pronta max()
maior_vlr = maior_valor(faturamento)
print(f"O maior valor de faturamento em um dia do mês foi R${maior_vlr}")

acima_media = dias_acima_media(faturamento)
print(f"Número de dias com faturamento acima da média mensal: {acima_media}")

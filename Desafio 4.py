faturamento = {'SP': 67836.43, 'RJ': 36678.66, 'MG': 29229.88, 'ES': 27165.48, 'Outros': 19849.53}
faturamento_total = 0

for value in faturamento.values():
    faturamento_total += value
faturamento['total'] = faturamento_total

porcentagem = {}
for key, value in faturamento.items():
    if key != 'total':
        porcentagem[key] = (value / faturamento['total']) * 100
        print(f"O valor da porcentagem para o estado {key} é de {round(porcentagem[key],2)}%")

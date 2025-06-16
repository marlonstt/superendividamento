document.getElementById('formulario').addEventListener('submit', async function(e) {
    e.preventDefault();
    
    // Coletar valores dos campos
    const renda = parseFloat(document.getElementById('renda').value);
    const dataHomologacao = document.getElementById('dataHomologacao').value;
    const parcelas = parseInt(document.getElementById('parcelas').value);
    const indice = document.getElementById('indice').value;
    const valorDivida = parseFloat(document.getElementById('valorDivida').value);
    const dataDivida = document.getElementById('dataDivida').value;

    // Validar campos obrigatórios
    if (!renda || !dataHomologacao || !parcelas || !valorDivida || !dataDivida) {
        alert('Por favor, preencha todos os campos!');
        return;
    }

    // Criar objeto no formato esperado pelo backend
    const planoRequest = {
        dividas: [
            {
                valor: valorDivida,
                data: dataDivida
            }
        ],
        indice: indice,
        dataHomologacao: dataHomologacao,
        rendaMensal: renda,
        numeroParcelas: parcelas
    };

    try {
        console.log('Enviando requisição:', planoRequest);
        
        const resp = await fetch('http://localhost:8080/api/plano', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(planoRequest)
        });

        const data = await resp.json();
        console.log('Resposta recebida:', data);

        if (!resp.ok) {
            throw new Error(data.message || 'Erro ao gerar plano!');
        }

        const tbody = document.querySelector('#tabelaParcelas tbody');
        tbody.innerHTML = '';
        
        if (!Array.isArray(data)) {
            console.error('Dados recebidos não são um array:', data);
            throw new Error('Formato de resposta inválido');
        }

        data.forEach((parcela, index) => {
            console.log(`Processando parcela ${index}:`, parcela);
            
            const tr = document.createElement('tr');
            
            // Garantir que os valores existam e sejam números
            const valor = typeof parcela.valor === 'number' ? parcela.valor.toFixed(2) : '0.00';
            const percentual = typeof parcela.percentualComprometimentoRenda === 'number' 
                ? parcela.percentualComprometimentoRenda.toFixed(2) 
                : '0.00';
            
            tr.innerHTML = `
                <td>${parcela.numero || index + 1}</td>
                <td>${parcela.dataVencimento || ''}</td>
                <td>R$ ${valor}</td>
                <td>${percentual}%</td>
            `;
            tbody.appendChild(tr);
        });
    } catch (error) {
        console.error('Erro ao processar resposta:', error);
        alert(error.message);
    }
}); 
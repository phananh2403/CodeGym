let state = [];

const sendToServer = (values) => {
    return values;
}

const toggle = (field) => {
    const values = [...state];

    const index = values.indexOf(field);

    if (index == -1) {
        if (values.length == 2) {
            const removedField = values.shift();
            document.getElementById(removedField).checked = false;
        }

        values.push(field);
    } else {
        values.splice(index, 1);
    }

    state = [...values];
    
    setTimeout(() => {
        const response = sendToServer(values);

        const fields = [
            'good',
            'fast',
            'cheap',
        ];
        
        if (state.join(',') === response.join(',')) {
            fields.forEach(f => {
                const isChecked = response.indexOf(f) != -1;
                document.getElementById(f).checked = isChecked;
            });
        }
    }, 1000);
}
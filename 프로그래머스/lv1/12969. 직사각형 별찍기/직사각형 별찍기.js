process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    let res = '';
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    for(let i=0; i<b; i++){
        res='';
        for(let j=0; j<a; j++){
            res += '*';
        }
        console.log(res);
    }
});
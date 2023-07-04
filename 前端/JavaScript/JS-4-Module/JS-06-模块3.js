const changeToFunkyColor = (domElement) => {
    const r = Math.random() * 255;
    const g = Math.random() * 255;
    const b = Math.random() * 255;
    domElement.style.background = `rgb(${r},${g},${b})`;
}

const changeColor = (domElement) => {
    domElement.style.background = rgb(100,150,150);
}

export {}
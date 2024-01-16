import React, { useState } from 'react';
import axios from 'axios';

function ProductForm() {
    const [name, setName] = useState('');
    const [description, setDescription] = useState('');
    const [price, setPrice] = useState('');

    const handleSubmit = event => {
        event.preventDefault();
        const newProduct = { name, description, price: parseFloat(price) };
        axios.post('/api/products', newProduct)
            .then(response => {
                setName('');
                setDescription('');
                setPrice('');
            })
            .catch(error => {
                console.log(error);
            });
    };

    return (
        <form onSubmit={handleSubmit}>
            <h2>Add Product</h2>
            <label>Name:</label>
            <input type="text" value={name} onChange={e => setName(e.target.value)} />
            <label>Description:</label>
            <input type="text" value={description} onChange={e => setDescription(e.target.value)} />
            <label>Price:</label>
            <input type="text" value={price} onChange={e => setPrice(e.target.value)} />
            <button type="submit">Add Product</button>
        </form>
    );
}

export default ProductForm;
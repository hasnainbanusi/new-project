document.addEventListener('DOMContentLoaded', () => {
    const cartButtons = document.querySelectorAll('.add-to-cart');
    const cartCountElement = document.getElementById('cart-count');
    let count = 0;

    cartButtons.forEach(button => {
        button.addEventListener('click', () => {
            // Increment cart count
            count++;
            cartCountElement.innerText = count;

            // Visual feedback
            button.innerText = "Added!";
            button.style.backgroundColor = "#c5a059";

            setTimeout(() => {
                button.innerText = "Add to Cart";
                button.style.backgroundColor = "#1a1a1a";
            }, 1000);

            // Simple console log for tracking
            console.log(`Item added to cart. Total items: ${count}`);
        });
    });
});
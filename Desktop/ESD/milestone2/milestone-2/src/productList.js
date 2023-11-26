
const ProdList = ({prods}) => {

    // const blogs = props.blogs;
    // const title = props.title;
    return ( 
        <div className="prod-list">
              {prods.map((prod)=> (
                <div className="prod-preview" key={prod.productId}>
                    <div className="prod-img">
                        <img src={prod.imagePath} alt="error" />
                    </div>
                    <div className="prodDesc">
                    <div className="desc-title">
                        {prod.prodName}
                    </div>
                    <div className="prod-price">
                        {prod.prodPrice}
                    </div>
                </div>
                </div>
            ))}
        </div>
        
    );
}
 
export default ProdList;
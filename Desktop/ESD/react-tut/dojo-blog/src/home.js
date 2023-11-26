import BlogList from "./BlogList";
import useFetch from "./useFetch";


const Home = () => {
    // const [name,setname] = useState('sara');
    // const[age,setage] = useState(21);
    // const handleClick = () => {
    //     setname('aman');
    //     setage(15);
    //     console.log('hello');
    // }
    // // const handleClickAgain = (name,e) => {
    // //     console.log('hello' + name,e);
    // }

    
    // const handleDelete = (id) => {
    //    const newBlogs = blogs.filter(blog => blog.id!==id)
    //    setBlogs(newBlogs)
    // }
    
    
    const { error, isLoading, data: blogs } = useFetch('http://localhost:8000/blogs')


    return (  
        <div className="home">
            {/* <h1>Homepage</h1>
            <p>Hi I'm {name} and my age is {age}.</p>
            <button onClick = {handleClick}>Click me </button> */}
            {/* <button onClick = {(e) => {
                handleClickAgain(' sara',e)
            } }>Click me again </button> */}
            {error && <div> { error } </div>}
            {isLoading && <div>Loading...</div>} {/*CL*/}
          {blogs && <BlogList blogs = {blogs} title = "All Blogs!" /> }
          {/* <BlogList blogs = {blogs.filter((blogs) => blogs.author==='mario')} title = "Mario's Blogs!" handleDelete = {handleDelete} />     */}
            {/* <button onClick = {() => {setName('aman')}}>change name</button> */}
            {/* blogs is the props used to pass in BlogList */}
            {/* <p>{ name }</p> */}
        </div>
    );
}
 
export default Home;
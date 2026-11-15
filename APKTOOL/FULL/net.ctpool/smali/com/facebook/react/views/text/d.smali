.class public Lcom/facebook/react/views/text/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/facebook/react/views/text/d;


# instance fields
.field private final a:LT1/b;


# direct methods
.method private constructor <init>(LT1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/text/d;->a:LT1/b;

    .line 5
    .line 6
    return-void
.end method

.method public static a()Lcom/facebook/react/views/text/d;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/d;->b:Lcom/facebook/react/views/text/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/views/text/d;

    invoke-static {}, LT1/b;->b()LT1/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/d;-><init>(LT1/b;)V

    sput-object v0, Lcom/facebook/react/views/text/d;->b:Lcom/facebook/react/views/text/d;

    :cond_0
    sget-object v0, Lcom/facebook/react/views/text/d;->b:Lcom/facebook/react/views/text/d;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/d;->a:LT1/b;

    invoke-virtual {v0, p1, p2, p3}, LT1/b;->c(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

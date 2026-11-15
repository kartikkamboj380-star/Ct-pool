.class Lcom/facebook/react/devsupport/L$b$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/L$b;->m(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Lcom/facebook/react/devsupport/L$b;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/L$b;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/L$b$b;->b:Lcom/facebook/react/devsupport/L$b;

    iput-object p2, p0, Lcom/facebook/react/devsupport/L$b$b;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([LT5/H;)Ljava/lang/Void;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    :try_start_0
    aget-object p1, p1, v1

    .line 10
    .line 11
    iget-object v1, p0, Lcom/facebook/react/devsupport/L$b$b;->a:Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p1, v1}, LT5/H;->b(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p1

    .line 22
    const-string v1, "InspectorPackagerConnection"

    .line 23
    .line 24
    const-string v2, "Couldn\'t send event to packager"

    .line 25
    .line 26
    invoke-static {v1, v2, p1}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [LT5/H;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/L$b$b;->a([LT5/H;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

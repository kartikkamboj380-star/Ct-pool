.class Lcom/facebook/react/devsupport/b0$e;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# static fields
.field private static final b:LT5/x;


# instance fields
.field private final a:LX1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, LT5/x;->f(Ljava/lang/String;)LT5/x;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/devsupport/b0$e;->b:LT5/x;

    return-void
.end method

.method private constructor <init>(LX1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/b0$e;->a:LX1/e;

    return-void
.end method

.method synthetic constructor <init>(LX1/e;Lcom/facebook/react/devsupport/c0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/b0$e;-><init>(LX1/e;)V

    return-void
.end method

.method private static b(LX1/j;)Lorg/json/JSONObject;
    .locals 9

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-interface {p0}, LX1/j;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-interface {p0}, LX1/j;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-interface {p0}, LX1/j;->a()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-interface {p0}, LX1/j;->e()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    const-string v1, "file"

    .line 28
    .line 29
    const-string v3, "methodName"

    .line 30
    .line 31
    const-string v5, "lineNumber"

    .line 32
    .line 33
    const-string v7, "column"

    .line 34
    .line 35
    invoke-static/range {v1 .. v8}, LS1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method protected varargs a([LX1/j;)Ljava/lang/Void;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/devsupport/b0$e;->a:LX1/e;

    .line 3
    .line 4
    invoke-interface {v1}, LX1/e;->v()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "/open-stack-frame"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, LT5/z;

    .line 35
    .line 36
    invoke-direct {v2}, LT5/z;-><init>()V

    .line 37
    .line 38
    .line 39
    array-length v3, p1

    .line 40
    const/4 v4, 0x0

    .line 41
    :goto_0
    if-ge v4, v3, :cond_0

    .line 42
    .line 43
    aget-object v5, p1, v4

    .line 44
    .line 45
    invoke-static {v5}, Lcom/facebook/react/devsupport/b0$e;->b(LX1/j;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    sget-object v6, Lcom/facebook/react/devsupport/b0$e;->b:LT5/x;

    .line 54
    .line 55
    invoke-static {v6, v5}, LT5/C;->d(LT5/x;Ljava/lang/String;)LT5/C;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-instance v6, LT5/B$a;

    .line 60
    .line 61
    invoke-direct {v6}, LT5/B$a;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v1}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6, v5}, LT5/B$a;->h(LT5/C;)LT5/B$a;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, LT5/B$a;->b()LT5/B;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v2, v5}, LT5/z;->a(LT5/B;)LT5/e;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-interface {v5}, LT5/e;->f()LT5/D;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catch_0
    move-exception p1

    .line 87
    const-string v1, "ReactNative"

    .line 88
    .line 89
    const-string v2, "Could not open stack frame"

    .line 90
    .line 91
    invoke-static {v1, v2, p1}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_0
    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [LX1/j;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/b0$e;->a([LX1/j;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

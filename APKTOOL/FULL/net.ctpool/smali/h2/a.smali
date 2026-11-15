.class public Lh2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/react/bridge/WritableMap;

.field private final c:J

.field private final d:Z

.field private final e:Lh2/e;


# direct methods
.method public constructor <init>(Lh2/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lh2/a;->a:Ljava/lang/String;

    iput-object v0, p0, Lh2/a;->a:Ljava/lang/String;

    iget-object v0, p1, Lh2/a;->b:Lcom/facebook/react/bridge/WritableMap;

    invoke-interface {v0}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iput-object v0, p0, Lh2/a;->b:Lcom/facebook/react/bridge/WritableMap;

    iget-wide v0, p1, Lh2/a;->c:J

    iput-wide v0, p0, Lh2/a;->c:J

    iget-boolean v0, p1, Lh2/a;->d:Z

    iput-boolean v0, p0, Lh2/a;->d:Z

    iget-object p1, p1, Lh2/a;->e:Lh2/e;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lh2/e;->copy()Lh2/e;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lh2/a;->e:Lh2/e;

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZ)V
    .locals 7

    .line 2
    sget-object v6, Lh2/f;->b:Lh2/f;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lh2/a;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZLh2/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZLh2/e;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lh2/a;->b:Lcom/facebook/react/bridge/WritableMap;

    iput-wide p3, p0, Lh2/a;->c:J

    iput-boolean p5, p0, Lh2/a;->d:Z

    iput-object p6, p0, Lh2/a;->e:Lh2/e;

    return-void
.end method


# virtual methods
.method a()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/a;->b:Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    return-object v0
.end method

.method b()Lh2/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/a;->e:Lh2/e;

    .line 2
    .line 3
    return-object v0
.end method

.method c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh2/a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh2/a;->d:Z

    .line 2
    .line 3
    return v0
.end method

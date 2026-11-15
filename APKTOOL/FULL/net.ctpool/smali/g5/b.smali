.class public Lg5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/facebook/react/bridge/WritableMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg5/b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lg5/b;->b:Lcom/facebook/react/bridge/WritableMap;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/b;->b:Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

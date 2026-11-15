.class public final synthetic Lcom/facebook/react/runtime/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/t;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iput-object p2, p0, Lcom/facebook/react/runtime/t;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lu2/f;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/t;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iget-object v1, p0, Lcom/facebook/react/runtime/t;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->z(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lu2/f;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

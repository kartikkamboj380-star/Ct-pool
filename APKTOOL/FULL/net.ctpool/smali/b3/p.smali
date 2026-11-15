.class public final synthetic Lb3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:Lb3/r;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lb3/r;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/p;->a:Lb3/r;

    iput-object p2, p0, Lb3/p;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb3/p;->a:Lb3/r;

    iget-object v1, p0, Lb3/p;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lb3/r;->h(Lb3/r;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

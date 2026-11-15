.class public final synthetic Lb4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Ljava/util/Map$Entry;

.field public final synthetic n:LA4/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;LA4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/t;->m:Ljava/util/Map$Entry;

    iput-object p2, p0, Lb4/t;->n:LA4/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb4/t;->m:Ljava/util/Map$Entry;

    iget-object v1, p0, Lb4/t;->n:LA4/a;

    invoke-static {v0, v1}, Lb4/u;->e(Ljava/util/Map$Entry;LA4/a;)V

    return-void
.end method

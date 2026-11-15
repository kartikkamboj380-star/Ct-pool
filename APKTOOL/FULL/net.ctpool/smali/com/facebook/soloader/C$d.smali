.class public final Lcom/facebook/soloader/C$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/soloader/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "d"
.end annotation


# instance fields
.field private final m:Lcom/facebook/soloader/C$c;

.field private final n:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Lcom/facebook/soloader/C$c;Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/soloader/C$d;->m:Lcom/facebook/soloader/C$c;

    iput-object p2, p0, Lcom/facebook/soloader/C$d;->n:Ljava/io/InputStream;

    return-void
.end method

.method static synthetic a(Lcom/facebook/soloader/C$d;)Ljava/io/InputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/soloader/C$d;->n:Ljava/io/InputStream;

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/C$d;->n:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/soloader/C$d;->n:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public d()Lcom/facebook/soloader/C$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/C$d;->m:Lcom/facebook/soloader/C$c;

    return-object v0
.end method
